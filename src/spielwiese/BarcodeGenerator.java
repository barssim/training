package spielwiese;
import java.awt.TextArea;
import java.awt.image.BufferedImage;
import java.awt.peer.TextAreaPeer;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


import org.krysalis.barcode4j.impl.code39.Code39Bean;
import org.krysalis.barcode4j.output.bitmap.*;
import org.krysalis.barcode4j.output.eps.EPSCanvasProvider;
import org.krysalis.barcode4j.tools.*;
/**
 * This example demonstrates creating a bitmap barcode using the bean API.
 * 
 * @author Jeremias Maerki
 * @version $Id: SampleBitmapBarcodeWithBean.java,v 1.2 2006/11/07 16:45:28 jmaerki Exp $
 */
public class BarcodeGenerator {
	

	 public static BufferedImage generateBarcode(String number) throws IOException {
		 BitmapCanvasProvider canvas = null;
		 OutputStream out;
	        try {
            //Create the barcode bean
        	 Code39Bean bean = new Code39Bean();
            final int dpi = 150;

            //Configure the barcode generator
            bean.setModuleWidth(UnitConv.in2mm(1.0f / dpi)); //makes the narrow bar 
                                                             //width exactly one pixel
            bean.setWideFactor(3);
            bean.doQuietZone(false);

            //Open output file
            File outputFile = new File("out.jpg");
            out = new FileOutputStream(outputFile);
//            try {
                //Set up the canvas provider for monochrome JPEG output 
            	 	
                 canvas = new BitmapCanvasProvider(
                		 dpi, BufferedImage.TYPE_BYTE_BINARY, false, 0);
                
                //Generate the barcode
                bean.generateBarcode(canvas, number);
                
                //Signal end of generation
                out.close();
                
            } catch (Exception e) {
            	e.printStackTrace();
            
            } finally {
            	canvas.finish();
                
            }
	       return  canvas.getBufferedImage();
	 }  
	 
	 public static void main(String[] args) throws IOException {
		BarcodeGenerator.generateBarcode("041011118123");
	}
}