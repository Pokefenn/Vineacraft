package pokefenn.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import pokefenn.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVineacraft extends Item {
    
    public ItemVineacraft(int id) {
    
    super(id = Reference.SHIFTED_ID_RANGE_CORRECTION);
    maxStackSize = 64;
    setNoRepair();
    
    }
    
    

}