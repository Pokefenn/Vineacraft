package pokefenn.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockVineaFurnace extends BlockVineacraft {

    public BlockVineaFurnace(int id) {
        
        super(id, Material.rock);
        this.setUnlocalizedName(Strings.VINEA_FURNACE_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setHardness(5F);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world) {
        return null;
    }

    
    @SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon sideIcon;
	@SideOnly(Side.CLIENT)
	private Icon frontIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		topIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.ADVANCED_MACHINE_BLOCK_TOP);
		sideIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.ADVANCED_MACHINE_BLOCK_SIDE);
		frontIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.VINEA_FURNACE_FRONT);
	
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		if(side == 0 ){
			return topIcon;
		}else if(side == 1) {
			return topIcon;
		}else if(side == 3){
			return frontIcon;
		}else{return sideIcon;
			
		
		
	}
	
	
}

    
    
    
}
