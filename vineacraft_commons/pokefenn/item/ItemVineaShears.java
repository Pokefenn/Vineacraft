package pokefenn.item;

import net.minecraft.item.ItemShears;
import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;

public class ItemVineaShears extends ItemShears {
    
    public ItemVineaShears(int id){
        
        super(id);
        this.setUnlocalizedName(Strings.VINEA_SHEARS_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setMaxStackSize(1);
        this.setMaxDamage(476);
        
        
        
    }

}
