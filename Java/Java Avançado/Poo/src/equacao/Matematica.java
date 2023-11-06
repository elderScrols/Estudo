package equacao;

public class Matematica {
	
	//Maior
	int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}
	
	//Menor
	int menor(int um, int dois) {
		if (um < dois) {
			return um;
		} else {
			return dois;
		}
	}

	//Soma
	double somar(double um, double dois) {
		double s = um + dois;
		return s;
	}
}
