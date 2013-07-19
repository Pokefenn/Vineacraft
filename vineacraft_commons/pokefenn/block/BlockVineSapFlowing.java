package pokefenn.block;

import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;

import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;

@SuppressWarnings("unused")
public class BlockVineSapFlowing extends BlockFlowing {

    protected BlockVineSapFlowing(int id) {
        
        super(id, Material.water);
        blockHardness = 100F;
        this.setLightOpacity(3);
        this.setUnlocalizedName(Strings.VINE_SAP_FLOWING_NAME);
        
        
        
    }
    }
 
    

