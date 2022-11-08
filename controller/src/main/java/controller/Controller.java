package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IUserOder;
import contract.IView;
import org.jetbrains.annotations.NotNull;

/**
 * The Class Controller.
 */

public final class Controller implements IController {

	/** The view. */
	private IView		view;

	/** The model. */
	private IUserOder model;

	private static final int speed = 400;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IUserOder model) {
		this.setView(view);
		this.setModel(model);
	}

	/**
     * Control.
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */


	/**
     * Sets the view.
     *
     * @param pview
     *            the new view
     */
	private void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IUserOder model) {
		this.model = model;
	}

	@Override
	public void control() {

	}

	/**
     * Order perform.
     *
     * @param controllerOrder
     *            the controller order
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final @NotNull ControllerOrder controllerOrder) {
		switch (controllerOrder) {
			case DOWN:
				this.getModel().getMyPlayer().moveDown();

			case UP:
				this.getModel().getMyPlayer().moveUp();

			case PUSH:
				this.getModel().getMyPlayer().movePush();

				break;
			case RIGHT:
				this.getModel().getMyPlayer().moveRight();

				break;
			case LEFT:
				this.getModel().getMyPlayer().moveLeft();

				break;
			case NOP:
			default:
				this.getModel().getMyPlayer().doNothing();
				break;
	}

}

	private IUserOder getModel()
	}
	}
