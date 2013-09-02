package pokefenn.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVineaBallInfuser extends ItemVineacraft {
	
	
	public ItemVineaBallInfuser(int id){
		
		super(id);
		this.setUnlocalizedName(Strings.VINEA_BALL_INFUSER_NAME);
		this.setCreativeTab(Vineacraft.tabsVineac);
		
	}

	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
    	
    	itemIcon = register.registerIcon(ModItems.TEXTURE_LOCATION + ":" + ModItems.VINEA_BALL_INFUSER_ICON);       
    	
    	
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add("Crafting component for things that Infuse");
    }
	
}


