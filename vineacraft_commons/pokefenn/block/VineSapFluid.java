package pokefenn.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class VineSapFluid extends BlockFluidClassic {

	public VineSapFluid(int id, Fluid fluid) {
		super(id, fluid, Material.water);
		this.setDensity(8);
		
	}


	@SideOnly(Side.CLIENT)
	private Icon stillIcon;
	@SideOnly(Side.CLIENT)
	private Icon flowingIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		flowingIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.VINE_SAP_STILL_ICON);
		stillIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.VINE_SAP_FLOWING_ICON);
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon( int side, int meta )
	{
		if ( side <= 1 )
			return stillIcon;
		else
			return flowingIcon;
	}
	
}
