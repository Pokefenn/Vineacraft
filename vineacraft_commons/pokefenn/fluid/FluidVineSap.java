package pokefenn.fluid;

import net.minecraft.util.Icon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import pokefenn.configuration.ConfigurationSettings;
import pokefenn.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FluidVineSap extends Fluid {
	
	
	public FluidVineSap() {
		
		
		super(Strings.FLUID_VINE_SAP_NAME);
		setDensity(ConfigurationSettings.VINE_SAP_DENSITY);
        setViscosity(ConfigurationSettings.VINE_SAP_VISCOSITY);
        FluidRegistry.registerFluid(this);
		
	}

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
	
}
