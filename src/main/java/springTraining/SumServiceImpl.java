package springTraining;

import org.springframework.stereotype.Service;

@Service
public class SumServiceImpl implements SumService {

	@Override
	public int sum(int x, int y) {
		return x + y;
	}
   
}
