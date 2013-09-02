package pokefenn.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVinium extends ItemVineacraft {
    
    public ItemVinium(int id) {
        
        
        super(id);
        this.setUnlocalizedName(Strings.VINIUM_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
    }

    
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
    	
    	itemIcon = register.registerIcon(ModItems.TEXTURE_LOCATION + ":" + ModItems.VINIUM_ICON);       
    	
    	
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add("Iron infused with vines, many crafting recipes!");
    }
}
