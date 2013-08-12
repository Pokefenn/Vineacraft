package pokefenn.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import pokefenn.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVineacraft extends Item {
    
    public ItemVineacraft(int id) {
    
    super(id - 256);
    maxStackSize = 64;
    setNoRepair();
    
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}