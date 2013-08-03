package pokefenn.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemShears;
import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;

public class ItemVineaShears extends ItemShears {
    

    public ItemVineaShears(int id){
        
        super(id);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setMaxStackSize(1);
        this.setMaxDamage(500);
        this.setUnlocalizedName(Strings.VINEA_SHEARS_NAME);
        
        
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
    	
    	itemIcon = register.registerIcon(ModItems.TEXTURE_LOCATION + ":" + ModItems.VINEA_SHEARS_ICON);       
    	
    	
    }
    

    
}
