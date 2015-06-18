/*******************************************************************************
 * Copyright (c) 2015
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *******************************************************************************/
package jsettlers.graphics.map.controls.original.panel;

import jsettlers.common.images.EImageLinkType;
import jsettlers.common.images.OriginalImageLink;
import jsettlers.graphics.action.ChangePanelAction;
import jsettlers.graphics.map.controls.original.panel.content.IContentProvider;
import jsettlers.graphics.ui.Button;

/**
 * This is a button intended to be used tp change the content of the main panel.
 * 
 * @author michael
 */
public class TabButton extends Button {

	private final IContentProvider content;

	public TabButton(IContentProvider content, int file, int image,
			int activeImage, String description) {
		this(content, new OriginalImageLink(EImageLinkType.GUI, file, image, 0),
				new OriginalImageLink(EImageLinkType.GUI, file, activeImage, 0),
				description);
	}

	public TabButton(IContentProvider content, OriginalImageLink image,
			OriginalImageLink activeImage, String description) {
		super(new ChangePanelAction(content), image, activeImage, description);
		this.content = content;
	}

	public void setActiveByContent(IContentProvider content) {
		setActive(content.equals(this.content));
	}

}
