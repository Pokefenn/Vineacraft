package pokefenn.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import pokefenn.lib.Textures;

public class ItemVineaHelmet extends ItemVineacraft implements ISpecialArmor {

	
	public ItemVineaHelmet(int id){
		super(id);
        this.setUnlocalizedName(Strings.VINEA_HELMET_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setMaxStackSize(1);
        this.setMaxDamage(1024);
		
		
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase player,
			ItemStack armor, DamageSource source, double damage, int slot) {
		return null;
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack,
			DamageSource source, int damage, int slot) {
		
	}
	
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
    	
    	itemIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.VINEA_HELMET_ICON);       
    	
    	
    }
	
}
