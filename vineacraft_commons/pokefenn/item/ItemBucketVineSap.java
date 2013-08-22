package pokefenn.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBucketVineSap extends ItemBucket {

	public ItemBucketVineSap(int id) {
		super(id - 256, id);
        this.setUnlocalizedName(Strings.BUCKET_VINE_SAP_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setMaxStackSize(1);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
    	
    	itemIcon = register.registerIcon(ModItems.TEXTURE_LOCATION + ":" + ModItems.BUCKET_VINE_SAP_ICON);       
    	
    	
    }
	
	
	 @Override
	 @SideOnly(Side.CLIENT)
	 public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean par4){
	    
	        list.add("An iron bucket holding Vine Sap.");
	    }

}
