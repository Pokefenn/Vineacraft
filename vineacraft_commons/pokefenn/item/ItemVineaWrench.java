package pokefenn.item;

import pokefenn.lib.Strings;

public class ItemVineaWrench extends ItemVineacraft {

    
    
    public ItemVineaWrench(int id){
        
        super(id);
        this.setUnlocalizedName(Strings.VINEA_WRENCH_NAME);
        //this.setCreativeTab(Vineacraft.tabsvineac);
        this.setMaxStackSize(1);
    }
}
