package pokefenn.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import pokefenn.vineacraft.Vineacraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVineaGrating extends ItemVineacraft {
	
	public ItemVineaGrating(int id){
		
		super(id);
		this.setUnlocalizedName("vineaGrating");
		this.setCreativeTab(Vineacraft.tabsVineac);
		
	}

	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
    	
    	itemIcon = register.registerIcon(ModItems.TEXTURE_LOCATION + ":" + ModItems.VINEA_GRATING_ICON);       
    	
    	
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add("Crafting recipe for many things!");
    }
	
}
