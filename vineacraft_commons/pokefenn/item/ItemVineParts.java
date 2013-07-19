package pokefenn.item;

import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;

public class ItemVineParts extends ItemVineacraft {

    
    public ItemVineParts(int id){
        
        super(id);
        this.setUnlocalizedName(Strings.VINE_PARTS_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        
    }
}
