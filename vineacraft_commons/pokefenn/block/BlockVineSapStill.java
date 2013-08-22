package pokefenn.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import pokefenn.vineacraft.Vineacraft;
import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidBlock;

public class BlockVineSapStill extends BlockStationary implements IFluidBlock {

	protected BlockVineSapStill(int id) {
		super(id, Material.water);
		this.setHardness(1F);
		this.setLightOpacity(0);
		this.setCreativeTab(Vineacraft.tabsVineac);
	}

	@Override
	public Fluid getFluid() {
		return null;
	}

	@Override
	public FluidStack drain(World world, int x, int y, int z, boolean doDrain) {
		return null;
	}

	@Override
	public boolean canDrain(World world, int x, int y, int z) {
		return false;
	}
	
/*
    @SideOnly(Side.CLIENT)
	private Icon allSidesIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		allSidesIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.VINE_SAP_STILL);
	
	}
*/


	
}
