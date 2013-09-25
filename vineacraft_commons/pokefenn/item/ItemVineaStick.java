package pokefenn.item;

import net.minecraft.client.renderer.texture.IconRegister;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import pokefenn.lib.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVineaStick extends ItemVineacraft {
	
	
 public ItemVineaStick(int id){
		
		super(id);
		this.setUnlocalizedName(Strings.VINEA_STICK_NAME);
		this.setCreativeTab(Vineacraft.tabsVineac);
		
	}

 
 
 @Override
 @SideOnly(Side.CLIENT)
 public void registerIcons(IconRegister register) {
 	
 	itemIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.VINEA_STICK_ICON);       
 	
 	
 }
 
 
 
}
