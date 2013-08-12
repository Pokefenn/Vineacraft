package pokefenn.item;

import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;

public class ItemVineaWrench extends ItemVineacraft {

    public ItemVineaWrench(int id){
        
        super(id);
        this.setUnlocalizedName(Strings.VINEA_WRENCH_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setMaxStackSize(1);
    }
    
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
    	
    	itemIcon = register.registerIcon(ModItems.TEXTURE_LOCATION + ":" + ModItems.VINEA_WRENCH_ICON);       
    	
    	
    }
}
