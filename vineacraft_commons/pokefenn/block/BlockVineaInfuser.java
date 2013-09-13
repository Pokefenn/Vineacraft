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

public class BlockVineaInfuser extends BlockVineacraft {

    public BlockVineaInfuser(int id){
        
        super(id, Material.wood);
        this.setUnlocalizedName(Strings.VINEA_INFUSER_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setHardness(3.0F);
        
    }
    
    
    @Override
    public TileEntity createNewTileEntity(World world) {
        return null;
    }

    
    @SideOnly(Side.CLIENT)
   	private Icon topAndBotIcon;
   	@SideOnly(Side.CLIENT)
   	private Icon sideIcon;
   	@SideOnly(Side.CLIENT)
   	private Icon frontIcon;
   	
   	@SideOnly(Side.CLIENT)
   	@Override
   	public void registerIcons(IconRegister register){
   		topAndBotIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.BASIC_MACHINE_BLOCK_TOP_AND_BOT);
   		sideIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.BASIC_MACHINE_BLOCK_SIDE);
   		frontIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.VINEA_INFUSER_FRONT);
   	
   	}
   	
   	@SideOnly(Side.CLIENT)
   	@Override
   	public Icon getIcon(int side, int meta) {
   	
   		if(side == 3){
   			return frontIcon;
   		}else if(side == 0 ){
   			return topAndBotIcon;
   		}else if(side == 1) {
   			return topAndBotIcon;
   		}else{
   			return sideIcon;
   		}
   		
   		
   	}
    
    
    
}
