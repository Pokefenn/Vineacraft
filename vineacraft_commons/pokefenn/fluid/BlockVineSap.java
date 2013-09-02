package pokefenn.fluid;

import pokefenn.Vineacraft;
import pokefenn.block.ModBlocks;
import pokefenn.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockVineSap extends BlockFluidClassic {
	
	
	public BlockVineSap(int id) {
		
		super(id, ModFluids.vineSap, Material.water);
		this.setUnlocalizedName(Strings.BLOCK_VINE_SAP_NAME);
		this.setCreativeTab(Vineacraft.tabsVineac);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
    return Block.waterMoving.getIcon(side, meta);
    }
	

	@Override
    public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z){
    return 0x999909;
    }
	
	//public static Icon vineSapStillIcon;
	@SideOnly(Side.CLIENT)
    public static Icon vineSapIcon;
	
}
