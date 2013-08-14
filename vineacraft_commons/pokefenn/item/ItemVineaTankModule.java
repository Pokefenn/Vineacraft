package pokefenn.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVineaTankModule extends ItemVineacraft {
	
	 public ItemVineaTankModule(int id){
	        
	        super(id);
	        this.setCreativeTab(Vineacraft.tabsVineac);
	        this.setUnlocalizedName(Strings.VINEA_TANK_MODULE_NAME);
	 }

	 @Override
	    @SideOnly(Side.CLIENT)
	    public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean par4)
	    {
	        list.add("Used for all vinea machines with a internal liquid buffer!");
	    }
	 @Override
	    @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister register) {
	    	
	    	itemIcon = register.registerIcon(ModItems.TEXTURE_LOCATION + ":" + ModItems.VINEA_TANK_MODULE_ICON);       
	    	
	    	
	    }
}
