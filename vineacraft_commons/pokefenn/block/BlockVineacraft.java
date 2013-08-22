package pokefenn.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import pokefenn.tileentity.TileVineacraft;

public abstract class BlockVineacraft extends BlockContainer {

    
    public BlockVineacraft(int id, Material material) {
        
        super(id, material);
    }
    
    
 protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
     
 }

 
 
 
}