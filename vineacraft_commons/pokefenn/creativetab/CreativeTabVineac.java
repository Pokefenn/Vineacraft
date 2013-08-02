package pokefenn.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;


public class CreativeTabVineac extends CreativeTabs {
    
    
    public CreativeTabVineac(int par1, String par2Str) {
        
        super(par1, par2Str);
    }

    
    @Override
    @SideOnly(Side.CLIENT)
    
    
    
    public int getTabIconItemIndex() {
        
        return Block.vine.blockID;
    }
    
    
}
