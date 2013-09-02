package pokefenn.fluid;

import net.minecraft.util.Icon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import pokefenn.block.ModBlocks;
import pokefenn.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FluidVineSap extends Fluid {
	
	
	public FluidVineSap() {
		
		
		super(Strings.FLUID_VINE_SAP_NAME);
		setDensity(50);
        setViscosity(4000);
        FluidRegistry.registerFluid(this);
		
	}

	 @Override
	    @SideOnly(Side.CLIENT)
	    public Icon getStillIcon(){
	        return BlockVineSap.vineSapIcon;
	    }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public Icon getFlowingIcon(){
	        return BlockVineSap.vineSapIcon;
	    }   
	
}
