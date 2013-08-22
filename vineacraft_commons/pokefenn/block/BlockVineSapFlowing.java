package pokefenn.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidBlock;

public class BlockVineSapFlowing extends BlockFlowing implements IFluidBlock {
	

	protected BlockVineSapFlowing(int id) {
		super(id, Material.water);
		this.setCreativeTab(Vineacraft.tabsVineac);
		this.setHardness(1F);
		this.setLightOpacity(1);
		
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

	@Override
	public float getFilledPercentage(World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
    @SideOnly(Side.CLIENT)
	private Icon allSidesIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		allSidesIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.VINE_SAP_FLOWING);
	
	}
*/
	
}

