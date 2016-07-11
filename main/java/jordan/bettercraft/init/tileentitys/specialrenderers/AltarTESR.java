package jordan.bettercraft.init.tileentitys.specialrenderers;

import jordan.bettercraft.init.tileentitys.AltarTileEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;

public class AltarTESR extends TileEntitySpecialRenderer<AltarTileEntity>
{
	@Override
    public void renderTileEntityAt(AltarTileEntity te, double x, double y, double z, float partialTicks, int destroyStage) {
        GlStateManager.pushAttrib();
        GlStateManager.pushMatrix();

        // Translate to the location of our tile entity
        GlStateManager.translate(x, y, z);
        GlStateManager.disableRescaleNormal();
        // Render our item
        renderItem(te);

        GlStateManager.popMatrix();
        GlStateManager.popAttrib();

    }
	
	private void renderItem(AltarTileEntity te) {
        ItemStack stack = te.getStack();
        
        if (stack != null) {
            RenderHelper.enableStandardItemLighting();
            GlStateManager.enableLighting();
            GlStateManager.pushMatrix();
            // Translate to the center of the block and .9 points higher
            GlStateManager.translate(.5, 1.2, .5);
            GlStateManager.scale(.4f, .4f, .4f);

            Minecraft.getMinecraft().getRenderItem().renderItem(stack, ItemCameraTransforms.TransformType.NONE);

            GlStateManager.popMatrix();
        }
    }

}
