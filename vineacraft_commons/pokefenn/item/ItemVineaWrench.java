package pokefenn.item;

import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;

public class ItemVineaWrench extends ItemVineacraft {

    
    
    public ItemVineaWrench(int id){
        
        super(id);
        this.setUnlocalizedName(Strings.VINEA_WRENCH_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setMaxStackSize(1);
    }
}
