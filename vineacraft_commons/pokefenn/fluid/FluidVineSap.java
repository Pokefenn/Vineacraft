package pokefenn.fluid;

import net.minecraft.util.Icon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import pokefenn.block.BlockVineSap;
import pokefenn.block.ModBlocks;
import pokefenn.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FluidVineSap extends Fluid {
	
	
	public FluidVineSap() {
		
		
		super(Strings.FLUID_VINE_SAP_NAME);
		setDensity(7);
        setViscosity(700);
        FluidRegistry.registerFluid(this);
		
	}
/*
	 @Override
	    @SideOnly(Side.CLIENT)
	    public Icon getStillIcon(){
	        return BlockVineSap.vineSapStillIcon;
	    }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public Icon getFlowingIcon(){
	        return BlockVineSap.vineSapFlowingIcon;
	    }   
	*/
}
