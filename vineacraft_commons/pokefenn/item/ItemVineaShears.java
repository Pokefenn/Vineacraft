package pokefenn.item;

import pokefenn.lib.Strings;

public class ItemVineaShears extends ItemVineacraft {
    
    public ItemVineaShears(int id){
        
        super(id);
        this.setUnlocalizedName(Strings.VINEA_SHEARS_NAME);
        //this.setCreativeTab(Vineacraft.tabsvineac);
        this.setMaxStackSize(1);
        this.setMaxDamage(476);
        
    }

}
