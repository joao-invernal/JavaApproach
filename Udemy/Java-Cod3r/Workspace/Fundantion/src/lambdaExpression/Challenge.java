package lambdaExpression;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Challenge {
	
	
	public static void main(String[] args) {
	
		
		
			
		Produto geladeiraSmart = new Produto("Refrigerator", 17717.14, 0.25);

		DecimalFormat df = new DecimalFormat("##.##");
		
		Function<Produto, Double> comDesconto = obj -> obj.value - (obj.value * obj.descount);
		Function<Double, Double> imposto = custo -> custo >= 2500 ? custo * 1.085 : custo;
		Function<Double, Double> frete = custo -> custo >= 3000 ? custo + 100.0 : custo + 50.0;
		// Método do Leo Leitão  =>  UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> arredonda = custo -> String.format("%.2f", custo);
		Function<String, String> formatar = custo -> "R$" + custo;
		
		System.out.println("Preço real (com desconto, tributo e frete): " + comDesconto.andThen(imposto).andThen(arredonda).andThen(formatar).apply(geladeiraSmart));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Classe usada pra fazer a instanciação do obj.
	public static class Produto {
		private String name;
		private double value;
		private double descount;
		
		public Produto(String name, double value, double descount) {
			super();
			this.name = name;
			this.value = value;
			this.descount = descount;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getValue() {
			return value;
		}

		public void setValue(double value) {
			this.value = value;
		}

		public double getDescount() {
			return descount;
		}

		public void setDescount(double descount) {
			this.descount = descount;
		}
		
		
		
		
		
	}
	
}
