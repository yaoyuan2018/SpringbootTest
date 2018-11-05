package ch2.scope;

import org.springframework.stereotype.Service;

@Service
public class DemoSingletonService {
}
//默认为Singleton，相当于@Scope("singleton")。