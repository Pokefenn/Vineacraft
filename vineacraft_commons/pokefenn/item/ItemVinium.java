package pokefenn.item;

import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;

public class ItemVinium extends ItemVineacraft {
    
    public ItemVinium(int id) {
        
        
        super(id);
        this.setUnlocalizedName(Strings.VINIUM_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
    }

}
