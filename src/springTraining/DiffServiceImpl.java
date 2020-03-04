package springTraining;

import org.springframework.stereotype.Service;

@Service
public class DiffServiceImpl implements DiffService{

	@Override
	public int diff(int x, int y) {
		return x - y;
	}
   
}
