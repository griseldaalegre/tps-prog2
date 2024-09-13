package procesadoresCompletoDinamico;

public class Main {
	
	public static void main(String[] args) {
		
		Tarea t1 = new Tarea(1, 10, 20);
		Tarea t2 = new Tarea(2, 5, 25);
		Tarea t3 = new Tarea(3, 15, 10);
		
		Procesador pPrior = new Procesador(new ColaDeTareasOrdenada(new ComparadorPorPrioridad()));
		pPrior.addTarea(t1);
		
		pPrior.addTarea(t3);
		pPrior.addTarea(t2);
		
		pPrior.ejecutar();
		pPrior.ejecutar();
		pPrior.ejecutar();
		
		Procesador pMem = new Procesador(new ColaDeTareasOrdenada(new ComparadorPorMemoria()));
		pMem.addTarea(t1);
		
		pMem.addTarea(t3);
		pMem.addTarea(t2);
		
		pMem.ejecutar();
		pMem.ejecutar();
		pMem.ejecutar();
		
		System.out.println("Por CPU");
		Procesador pCPU = new Procesador(new ColaDeTareasOrdenada(new ComparadorPorCPU()));
		pCPU.addTarea(t1);
		
		pCPU.addTarea(t3);
		pCPU.addTarea(t2);
		
		pCPU.ejecutar();
		pCPU.ejecutar();
		pCPU.ejecutar();
		
		Procesador pLifo = new Procesador(new ColaDeTareasLIFO());
		Procesador pOtraRef = pLifo;
		pLifo.addTarea(t1);
		pLifo.addTarea(t2);
		pLifo.addTarea(t3);
		
		
		System.out.println(pLifo);
		pLifo.setColaDeTareas(new ColaDeTareasOrdenada(new ComparadorPorMemoria()));
		System.out.println(pLifo);
		pLifo.setColaDeTareas(new ColaDeTareasOrdenada(new ComparadorPorCPU()));
		System.out.println(pLifo);
		
		pLifo.ejecutar();
		
		System.out.println(pOtraRef);
		

	}

}
