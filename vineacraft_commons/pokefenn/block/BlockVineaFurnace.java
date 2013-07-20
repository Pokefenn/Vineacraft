package pokefenn.block;

import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockVineaFurnace extends BlockVineacraft {

    public BlockVineaFurnace(int id) {
        
        super(id, Material.rock);
        this.setUnlocalizedName(Strings.VINEA_FURNACE_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world) {
        // TODO Auto-generated method stub
        return null;
    }

}
