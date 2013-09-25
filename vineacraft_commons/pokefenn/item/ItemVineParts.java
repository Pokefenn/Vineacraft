package pokefenn.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import pokefenn.lib.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVineParts extends ItemVineacraft {

    public ItemVineParts(int id){
        
        super(id);
        this.setUnlocalizedName(Strings.VINE_PARTS_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add("Byproduct of squeezing!");
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
    	
    	itemIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.VINE_PARTS_ICON);       
    	
    	
    }
}
