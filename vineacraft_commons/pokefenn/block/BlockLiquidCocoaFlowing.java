package pokefenn.block;

import pokefenn.lib.Strings;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;

public class BlockLiquidCocoaFlowing extends BlockFlowing {
    
    
    protected BlockLiquidCocoaFlowing(int id){
        
        super(id, Material.water);
        blockHardness = 100F;
        this.setLightOpacity(3);
        this.setUnlocalizedName(Strings.LIQUID_COCOA_FLOWING_NAME);
    }
    
    

}
