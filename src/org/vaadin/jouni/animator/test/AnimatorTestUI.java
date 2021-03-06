package org.vaadin.jouni.animator.test;

import org.vaadin.jouni.animator.Animator;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("runo")
public class AnimatorTestUI extends UI {
    @Override
    public void init(VaadinRequest request) {
        final UI ui = this;
        setContent(new VerticalLayout() {
            {
                final Animator animator = new Animator(ui);

                final Button button = new Button("Animate Me");
                addComponent(button);

                button.addClickListener(new ClickListener() {
                    @Override
                    public void buttonClick(ClickEvent event) {
                        // animator.fadeIn(event.getButton()).when(Event.CLICK,
                        // getUI());
                        //
                        // new FadeIn(button).when(Event.CLICK, getUI());
                    }
                });

            }
        });

    }

}
