package pokefenn.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import pokefenn.lib.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVineaShears extends ItemShears {
    

    public ItemVineaShears(int id){
        
        super(id - 256);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setMaxStackSize(1);
        this.setMaxDamage(500);
        this.setUnlocalizedName(Strings.VINEA_SHEARS_NAME);
        
        
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
    	
    	itemIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.VINEA_SHEARS_ICON);       
    	
    	
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add("Advanced shears for all your vine needs!");
    }
    
}
