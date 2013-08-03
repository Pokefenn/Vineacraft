package pokefenn.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVinium extends ItemVineacraft {
    
    public ItemVinium(int id) {
        
        
        super(id);
        this.setUnlocalizedName(Strings.VINIUM_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
    }

    
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
    	
    	itemIcon = register.registerIcon(ModItems.TEXTURE_LOCATION + ":" + ModItems.VINIUM_ICON);       
    	
    	
    }
    
    
}
