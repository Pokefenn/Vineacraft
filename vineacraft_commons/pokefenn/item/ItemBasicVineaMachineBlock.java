package pokefenn.item;

import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;

public class ItemBasicVineaMachineBlock extends ItemVineacraft {
    
    public ItemBasicVineaMachineBlock(int id){
        
        super(id);
        this.setUnlocalizedName(Strings.BASIC_VINEA_MACHINE_BLOCK_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
    }

}
