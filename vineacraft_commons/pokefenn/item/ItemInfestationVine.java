package pokefenn.item;

import net.minecraft.block.BlockWood;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemInfestationVine extends ItemVineacraft {

	public ItemInfestationVine(int id) {
		super(id);
        this.setUnlocalizedName(Strings.INFESTATION_VINE_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        setMaxStackSize(1);
        this.setMaxDamage(10);
	}
	
	@SideOnly(Side.SERVER)
	public boolean onBlockActivated(ItemStack itemstack, EntityPlayer player, BlockWood target){
		
			
			
		
		
		return false;
	
	}
	


	
	
	

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister register) {
	
	itemIcon = register.registerIcon(ModItems.TEXTURE_LOCATION + ":" + ModItems.INFESTATION_VINE_ICON);       
	
	
}


}