package cp213;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Horizontal bar for reactor power.
 * 
 */
@SuppressWarnings("serial")
public class PowerView extends BarView {

    private Reactor model = null;

    /**
     * Constructor.
     * 
     * @param model
     *            The reactor.
     */
    public PowerView(Reactor model) {
	super(Color.BLUE, Reactor.MAX_POWER);
	this.model = model;
    }

    @Override
    public void paintComponent(Graphics g) {
	this.modelValue = this.model.getPower();
	super.paintComponent(g);
    }
}
