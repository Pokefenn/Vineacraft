package pokefenn.fluid;

import net.minecraftforge.fluids.Fluid;

public class ModFluids {
	
	public static Fluid vineSap;
	
	
	public static void init(){
		
		vineSap = new FluidVineSap();
		
	}

}
