package springTraining;

import org.springframework.stereotype.Component;

@Component
public class MathServiceImpl implements MathService{
  private final SumService sumService;
  private final DiffService diffService;
  
public MathServiceImpl(SumService sumService, DiffService diffService) {
	this.sumService = sumService;
	this.diffService = diffService;
}

@Override
public int sum(int x, int y) {
	return this.sumService.sum(x, y);
}

@Override
public int diff(int x, int y) {
	return diffService.diff(x, y);
}
  
  
}
