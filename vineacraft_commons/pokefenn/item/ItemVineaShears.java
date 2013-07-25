package pokefenn.item;

import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import pokefenn.vineacraft.Vineacraft;

public class ItemVineaShears extends ItemShears {
    


    private static final String[] VINEA_SHEARS_NAMES = new String[] {"Vinium"};
    


    public ItemVineaShears(int id){
        
        super(id);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setMaxStackSize(1);
        this.setMaxDamage(500);
        
        
        
    }

    
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {

        int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, 5);
        return super.getUnlocalizedName() + VINEA_SHEARS_NAMES[meta];
}
    
}
