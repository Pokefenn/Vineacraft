package pokefenn.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAutomaticSqueezer extends BlockVineacraft {

    public BlockAutomaticSqueezer(int id) {

        super(id, Material.rock);
        this.setUnlocalizedName(Strings.AUTOMATIC_SQUEEZER_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        
        
        
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return null /*new TileAutomaticSqueezer*/;
    }
    
    
    @SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon sideIcon;
	@SideOnly(Side.CLIENT)
	private Icon bottomIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		topIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.AUTOMATIC_SQUEEZER_TOP);
		sideIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.AUTOMATIC_SQUEEZER_SIDE);
		bottomIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.ADVANCED_MACHINE_BLOCK_BOTTOM);
	
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		if(side == 0 ){
			return bottomIcon;
		}else if(side == 1) {
			return bottomIcon;
		}else{
			return sideIcon;
		}
		
		
	}
	
	
    
}
