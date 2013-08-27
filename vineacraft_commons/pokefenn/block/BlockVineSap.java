package pokefenn.block;

import pokefenn.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockVineSap extends BlockFluidClassic {
	
	
	public BlockVineSap(int id, Fluid fluid, Material material) {
		
		super(id, fluid, material);
		this.setUnlocalizedName(Strings.BLOCK_VINE_SAP_NAME);
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
    return Block.waterMoving.getIcon(side, meta);
    }
	

	@Override
    public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z){
    return 0x990000;
    }
	
	public static Icon vineSapStillIcon;
    public static Icon vineSapFlowingIcon;
	
	
}
