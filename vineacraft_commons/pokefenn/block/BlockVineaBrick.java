package pokefenn.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;

public class BlockVineaBrick extends BlockVineacraft {
	
	public BlockVineaBrick (int id) {
	       
	       super(id, Material.rock);
	       this.setUnlocalizedName(Strings.VINEA_BRICK_NAME);
	       this.setCreativeTab(Vineacraft.tabsVineac);
	       this.setHardness(2F);
	   }

	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}

    @SideOnly(Side.CLIENT)
	private Icon allSidesIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		allSidesIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.VINEA_BRICK_ALL_SIDES);
	
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		return allSidesIcon;
		
		
	}
	
}
