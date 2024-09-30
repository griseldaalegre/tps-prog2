package clases.procesadores;

public class Main {
	
	public static void main(String[] args) {
		
		Tarea t1 = new Tarea(1, 10, 20);
		Tarea t2 = new Tarea(2, 5, 25);
		Tarea t3 = new Tarea(4, 15, 10);
		
		Procesador pPrior = new ProcesadorPorPrioridad();
		pPrior.addTarea(t1);
		
		pPrior.addTarea(t3);
		pPrior.addTarea(t2);
		
		pPrior.ejecutar();
		pPrior.ejecutar();
		pPrior.ejecutar();
		
		Procesador pMem = new ProcesadorPorMemoria();
		pMem.addTarea(t1);
		
		pMem.addTarea(t3);
		pMem.addTarea(t2);
		
		pMem.ejecutar();
		pMem.ejecutar();
		pMem.ejecutar();
		
		System.out.println("Por CPU");
		Procesador pCPU = new ProcesadorPorCPU();
		pCPU.addTarea(t1);
		
		pCPU.addTarea(t3);
		pCPU.addTarea(t2);
		
		pCPU.ejecutar();
		pCPU.ejecutar();
		pCPU.ejecutar();
		

	}

}
