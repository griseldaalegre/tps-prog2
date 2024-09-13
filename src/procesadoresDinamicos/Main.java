package procesadoresDinamicos;

public class Main {
	
	public static void main(String[] args) {
		
		Tarea t1 = new Tarea(1, 10, 20);
		Tarea t2 = new Tarea(2, 5, 25);
		Tarea t3 = new Tarea(4, 15, 10);
		
		//Procesador pPrior = new ProcesadorPorPrioridad();
		Procesador pPrior = new Procesador(new ComparadorPorPrioridad());
		pPrior.addTarea(t1);
		
		pPrior.addTarea(t3);
		pPrior.addTarea(t2);
		
		pPrior.ejecutar();
		pPrior.ejecutar();
		pPrior.ejecutar();
		
		//Procesador pMem = new ProcesadorPorMemoria();
		Procesador pMem = new Procesador(new ComparadorPorMemoria());
		pMem.addTarea(t1);
		
		pMem.addTarea(t3);
		pMem.addTarea(t2);
		
		pMem.ejecutar();
		pMem.ejecutar();
		pMem.ejecutar();
		
		System.out.println("Por CPU");
		//Procesador pCPU = new ProcesadorPorCPU();
		Procesador pCPU = new Procesador(new ComparadorPorCPU());
		
		Procesador pX = pCPU;
		
		pCPU.addTarea(t1);
		pCPU.addTarea(t3);
		pCPU.addTarea(t2);
		
		System.out.println(pCPU);
		//pCPU = new ProcesadorPorMemoria(pCPU);
		pCPU.setComparador(new ComparadorPorMemoria());
		System.out.println(pCPU);
		System.out.println(pX);
		
		pCPU.ejecutar();
		pCPU.ejecutar();
		pCPU.ejecutar();
		

	}

}
